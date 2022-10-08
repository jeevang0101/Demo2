import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JsonPath js=new JsonPath(payload.CoursePrice());
		//Print No of courses returned by API
		
int count=	js.getInt("courses.size()");
System.out.println(count);
//Print Purchase Amount
int totalAmount= js.getInt("dashboard.purchaseAmount");
System.out.println(totalAmount);
//Print Title of the first course


  String titleFirstCourse=js.get("courses[2].title");
  System.out.println(titleFirstCourse);
  
  //Print All course titles and their respective Prices
  
  for(int i=0;i<count;i++)
  {
	  String courseTitles=js.get("courses["+i+"].title");
	  System.out.println(js.get("courses["+i+"].price").toString());
	  
	  System.out.println(courseTitles);
	  
  }
  //Print no of copies sold by RPA Course
  
 System.out.println("Print no of copies sold by RPA Course");
 
 for(int i=0;i<count;i++)
 {
	  String courseTitles=js.get("courses["+i+"].title");
	  if(courseTitles.equalsIgnoreCase("RPA"))
	  {
		  int copies=js.get("courses["+i+"].copies");
		  System.out.println(copies);
		  break;
	  }
	
	  
 }
 //git change50-online
//git change51-online
//git change52-online
//git change53
//git change54
//git change55
//git change56-local
//git change57-local
//git change58-local
//git change53
//git change54
//git change55
//git change56-server
//git change57-server
//git change58-server
//git change65-server
//git change66-server
//git change67-server
 
	}

}
