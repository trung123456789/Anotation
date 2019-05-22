package bqtrung.obj;

import bqtrung.impl.IMyFirstAnnotation;

@IMyFirstAnnotation(name = "Some name", description = "Some description")
public class UsingMyFirstAnnotation {
	// Annotation được gắn trên một Constructor.
	// Với giá trị của phần tử name là "John"
	// Giá trị phần tử description là "Write by John".
	@IMyFirstAnnotation(name = "John", description = "Write by John")
	public UsingMyFirstAnnotation() {

	}

	// Annotation được gắn trên một phương thức.
	// Với giá trị của phần tử 'name' là "Tom"
	// Phần tử 'description' không được khai báo, nó sẽ lấy theo mặc định.
	@IMyFirstAnnotation(name = "Tom")
	public void someMethod() {

	}

	// Annotation gắn trên tham số của một phương thức.
	public void todo(@IMyFirstAnnotation(name = "none") String job) {

		// Annotation được gắn lên biến địa phương.
		@IMyFirstAnnotation(name = "Some name")
		int localVariable = 0;

	}
}
