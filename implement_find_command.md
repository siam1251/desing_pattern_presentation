### Implement find command that takes input of file extension and a size ( it can be extended <, > , == for the size). The command will return list of files that satisifies these constraints

class File{
  string absolute_path;
  int size;
  int parent;
};
enum Params{type, size_equal, size_smaller, size_greater};
class FilterHelper{
  vector<File> apply(Enum param, string value){
    switch(param){
      case Params.type:
        filter_based_on_type(vector<File> files, value);
        break;
      case Params.size_equal:
        filter_based_on_size_equal(vector<File> files, value)
        break
    }
  }
  
  vector<File> files filter_based_on_type(vector<File> files, value){
  }
  vector<File> files filter_based_on_size_equal(vector<File> files, value){
  }
  vector<File> files filter_based_on_size_smaller(vector<File> files, value){
  }
}


class Filter{
  vector<File> files;
  vector<pair<Params, string> arguments;
  void build(vector<pair<Params, string>  arguments, FilterHelper helper){
     for(pair<Params, String> arg: arguments){
        this->files = helper.apply(arg.first, arg.second, this->files);
     }
  }
  
  Filter operator&(const Filter& right ){
  }
  
};


Class FindCommand{
    FindCommand(argc, char** args){
      
      vector<pair<Params, string> arguments;
      Filter filter(get_all_files(arg[0]);
      for(int i = 1; i < argc; i++){
        if(args[i] == "&"){
          
        }else{
          arguments.push_back();
        }
      }
    }
}
