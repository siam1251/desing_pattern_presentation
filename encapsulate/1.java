class Dog extends Pet{
   void bark(){
   	printf("barking ..");
   }

}

class Cat extends Pet{
	void mew(){
		printf("mewing ..")
	}
}

class Duck extends Pet{
	void quack(){
		printf("quacking ...")
	}
}


//######### main #####
int main(Pet pet){


	if (pet instanceof Dog) {
	  pet.bark();
	} else if (pet instanceof cat) {
	  pet.meow();
	} else if (pet instanceof duck) {
	  pet.quack()
	}
}
	
