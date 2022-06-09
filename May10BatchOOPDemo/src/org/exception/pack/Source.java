package org.exception.pack;

class Activity1{
	  //Implement Activity class here..
	   String string1;
	   String string2;
	   String operator;

		    public Activity1(String string1,String string2,String operator){
		      this.string1=string1;
		      this.string2=string2;
		      this.operator=operator;
		    }
	}
public class Source {
	public String handleException(Activity1 a) {
		 try{
		        if(a.string1.equals(null) || a.string2.equals(null)){
		        	throw new NullPointerException();
	          }
	          if(!a.operator.equals("+") || !a.operator.equals("-"))
	            throw new Exception(); 
		    }
		    catch(NullPointerException e){
		        return "Null values found";
		    }
	      catch(Exception e) {
	          return a.operator;
	      }
	      return "No Exception Found";
	}
	public String doOperation(Activity1 a){
        String result="";
        switch(a.operator){
          case "+":
                  result=a.string1.concat(a.string2);
                  break;
          case "-":
                result=a.string1.replace(a.string2,"");
                break;
        }
        return result;


	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity1 a=new Activity1( "Hello","World","+");
	}

}
