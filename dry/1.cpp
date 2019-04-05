class YellowDetector{
	boolean init(string name, string path){
		this->detectorName = name;
		setDefaultValues();
		return loadModel(path);
	}

	void setDefaultValues(){
		this->m_modelFileDir = "";
        this->m_modelFileName = "";
        this->m_inputTensorWidth = 300;
        this->m_inputTensorHeight = 300;
        this->m_inputTensorDepth = 3;
        this->m_threshold = 0.5f;
        this->m_detector = NULL;
        this->m_minBBoxArea = 0.0;
        this->m_minDetAreaThreshold = 0.15;
		this->m_fBBoxScaleFactor = 1.10f;
        this->m_currentFrameRotationWeight = 0.1f;
	}

	boolean loadModel(string path){
		// TODO
		//model loading logic goes here
	}


}



class SSDDetector{
	boolean init(string name, string path){
		this->detectorName = name;
		setDefaultValues();
		return loadModel(path);
	}

	void setDefaultValues(){
		this->m_modelFileDir = "";
        this->m_modelFileName = "";
        this->m_inputTensorWidth = 300;
        this->m_inputTensorHeight = 300;
        this->m_inputTensorDepth = 3;
        this->m_threshold = 0.5f;
        this->m_detector = NULL;
        this->m_minBBoxArea = 0.0;
        this->m_minDetAreaThreshold = 0.15;
		this->m_fBBoxScaleFactor = 1.10f;
        this->m_currentFrameRotationWeight = 0.1f;
	}

	boolean loadModel(string path){
		// TODO
		//model loading logic goes here
	}


}