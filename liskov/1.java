class Rectangle{
	void setWidth(double width){
		this.width = width;
	}
	void setHeight(double height){
		this.height = height;
	}

	double getArea(){

		return height*width;
	}
}


// Square is a rectangle

class Square extends Rectangle{

	void setHeight(double height){
		this.width = height;
		this.height = height;
	}

	void setWidth(double width){
		this.width = width;
		this.height = width;
	}
}