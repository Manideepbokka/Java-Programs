package com.java.lambda.functional;
import java.util.function.Supplier;
import java.time.LocalDateTime;
//class SupplierImpl implements Supplier<LocalDateTime>
//{
//
//	@Override
//	public LocalDateTime get() {
//		// TODO Auto-generated method stub
//		return LocalDateTime.now();
//	}
//	
//}
public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Supplier<LocalDateTime> sp=new SupplierImpl();
//		System.out.println(sp.get());
		Supplier<LocalDateTime> ans=()->LocalDateTime.now();
		System.out.println(ans.get());

	}

}
