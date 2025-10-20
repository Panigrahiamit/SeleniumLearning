package Package_2;

import maven.Access_modi;



public class learning_accessmodifiers {
	
	public class abc extends Access_modi {

		void test() {
			//m2();
			m3();
			// m1(); default method is not accessible outside the package because it is not
			// public.
			// m4(); private method is not accessible outside the class.
		}
// How to call private method of another class?
		// You cannot call private method of another class directly.
		// You can call private method of another class indirectly by calling public method of that class which in turn calls private method.
		
		
//How to call default method of another class?
		// You cannot call default method of another class directly if it is in another package.
		// You can call default method of another class indirectly by calling public
		// method of that class which in turn calls default method.
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_modi a=new Access_modi();
		a.m2();
		
		System.out.println();
		a.m5();
		// a.m1(); default method is not accessible outside the package because it is not public.
		// a.m3(); protected method is not accessible outside the package because it is not public.
		// a.m4(); private method is not accessible outside the class
		
		abc obj = new learning_accessmodifiers().new abc();
		// what is the above line?
		// it is used to create an object of inner class abc.
		// inner class is a class defined within another class.
		// 
		System.out.println();
		obj.test();
	}

}


//Summary of access modifiers in java
//1. private: accessible only within the same class and can only be accessed indirectly outside the class by calling public method of that class.
//2. default: accessible within the same package only and can only be accessed indirectly outside the package by calling public method of that class.
//3. protected: accessible within the same package and outside the package but only in subclass by extending the class.
//and can only be accessed indirectly outside the package by calling public method of that class.
//4. public: accessible from anywhere.


