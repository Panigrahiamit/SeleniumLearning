package maven;

public class Access_modi {

	void m1() {
		System.out.println("default method");
	}
	// default access modifier can be accessed within the same package only.
	// default access modifier is not accessible outside the package because it is not public.
	// default access modifier is not accessible in subclass outside the package.
	// default access modifier is accessible in subclass within the package.
	// So i can call default method in another method of the same class including private method.
	public void m2() {
        System.out.println("public method");
	}
    // public access modifier can be accessed from anywhere.
	// public access modifier is accessible outside the package.
	// public access modifier is accessible in subclass outside the package.
	// public access modifier is accessible in subclass within the package.
	// So i can call public method in another method of the same class including private method.
	
	
	protected  void m3() {
		System.out.println("protected method");
	}
	// protected access modifier can be accessed within the same package.
	// protected access modifier is accessible outside the package but only in subclass.
	// how protected method is accessible outside the package in subclass? By inheritance for example in another package class extends this class.
	
	
	private void m4() {
        System.out.println("private method");      
         
	}
	
	public void m5() {
        m1();
        m2();
        m3();
        m4();
	}
	
	void m6() {
		m1();
		m2();
		m3();
		m4();
	}
	
	protected void m7() {
		m1();
		m2();
		m3();
		m4();
	}
	
	private void m8() {
		m1();
		m2();
		m3();
		m4();
	}

}


