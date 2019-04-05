
#include <vector>
#include <string>

class CFastDetector
{
public:
    CFastDetector();
    virtual ~CFastDetector();
    std::string getName(void)
    {
        return this->m_detectorName;
    };
    virtual bool init(const HVISIONUTIL::ConfigureProperty& prop, HVISIONUTIL::CRCModelBuffer** crcModelBufferArray=nullptr, int noOfBuffers=0)=0;
    virtual bool init(const HVISIONUTIL::ConfigureProperty& prop)=0;

    virtual void reset() {};

    virtual bool SetRoi(std::string& roi_str)
    {
        return false; // false: not implemented yet.
    };
    virtual int Detect(const HVISIONUTIL::CRCMatrix& inImage, std::vector<HVISIONUTIL::DetectObjectInfo>& vOutDetResult)=0;
    virtual int Detect(const std::vector<HVISIONUTIL::CRCMatrix>& vInImages, std::vector<std::vector<HVISIONUTIL::DetectObjectInfo> >& vOutDetResults)=0;
    virtual int GetBatchsize(void)=0;

    static CFastDetector* CreateDetector(const std::string& name);

protected:
    std::string m_detectorName;
};

