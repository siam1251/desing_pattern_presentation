class Pet{
	abstract void speak();
}

class Dog extends Pet{
   void speak(){
   	printf("barking ..");
   }

}

class Cat extends Pet{
	void speak(){
		printf("mewing ..")
	}
}

class Duck extends Pet{
	void speak(){
		printf("quacking ...")
	}
}


//######### main #####
int main(Pet pet){

	pet.speak();
}
	
