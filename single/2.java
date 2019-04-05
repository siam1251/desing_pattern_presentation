
Class Content{
	Content(string str){
		type = getType(str);
		if (type == plainText){
    		emailContent = content;
    	}else (type == html){
    		while()
    		// goes on
    		// whole parsing logic
    	}
	}
}

public class Email
{
    Content content;
    public void setRecipient(String[] email) {  }
    public void setSubject(String header) {  }
    public void setFooter(string footer) {}

    public void setContent(string content){
    	content = new Content(content);
    }
}
