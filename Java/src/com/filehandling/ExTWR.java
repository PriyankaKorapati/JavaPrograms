package com.filehandling;

import java.io.Closeable;
import java.io.IOException;


class Alpha implements Closeable{
	public void running(){
		System.out.println("hello java");
	}

	@Override
	public void close() throws IOException {
		System.out.println("closeing connection");
		
	}
	
}
public class ExTWR implements AutoCloseable{
	public void rundata() {
		System.out.println("using autocloseable");
	}
	@Override
	public void close() throws Exception {
		System.out.println("close method override");
		
	}
	public static void main(String[] args) {
		ExTWR obj1 = new ExTWR();
		Alpha obj2 = new Alpha();
		
		try(obj1;obj2) {
			obj1.rundata();
			obj2.running();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
