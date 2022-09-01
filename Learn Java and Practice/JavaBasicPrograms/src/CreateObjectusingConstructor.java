
import java.lang.reflect.*;   
public class CreateObjectusingConstructor  
{   
private String str;   
CreateObjectusingConstructor()   
{   
}   
public void setName(String str)   
{   
this.str = str;   
}   
public static void main(String[] args)   
{   
try  
{   
Constructor<CreateObjectusingConstructor> constructor = CreateObjectusingConstructor.class.getDeclaredConstructor();   
CreateObjectusingConstructor r = constructor.newInstance();   
r.setName("JavaTpoint");   
System.out.println(r.str);   
}   
catch (Exception e)   
{   
e.printStackTrace();   
}   
}   
}  