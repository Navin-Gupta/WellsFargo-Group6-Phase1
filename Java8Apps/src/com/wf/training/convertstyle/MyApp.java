package com.wf.training.convertstyle;

class GreetingsApi{
	/*public void conveyGreetings(String message) {
		System.out.println(message);
	}
	public void conveyGreetings(String message, String dest) {
		//if -switch
		System.out.println(message);
	}
	
	// method overloading
	 
	*/
	
	public void conveyGreetings(String message, Greetings greetings) {
		greetings.sendGreetings(message);
	}
	
}

// some random class
class Sample{
	public static void staticRes(String str) {
		System.out.println("Static resource consuming string : " + str);
	}
	
	public void instanceRes(String str) {
		System.out.println("Instance resource consuming string : " + str);
	}
}


public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingsApi greet = new GreetingsApi();
		// greet.conveyGreetings("Hello All");
		
		// EmailGreetings email = new EmailGreetings();
		Greetings email = new EmailGreetings();
		greet.conveyGreetings("Hello All", email);
		
		Greetings sms = new SmsGreetings();
		greet.conveyGreetings("Hello All", sms);
		
		/*greet.conveyGreetings("Hello All", new Greetings() {
			@Override
			public void sendGreetings(String message) {
				System.out.println("Send over Twitter : " + message);
			}
		});*/
		
		// <instance> = <object>
		// <instance> = <function>
		/* twitter = public void sendGreetings(String message) {
							System.out.println("Send over Twitter : " + message);
				     }*/
		
		/*Function twitter = public void sendGreetings(String message) {
								System.out.println("Send over Twitter : " + message);
						     }*/
		
		// interface ref can also refer to a function (pure)
		/*Greetings twitter = public void sendGreetings(String message) {
								System.out.println("Send over Twitter : " + message);
						     }*/
		// pure functions has be defined as Lambda expression
		Greetings twitter = message -> System.out.println("Send over Twitter : " + message);
		
		greet.conveyGreetings("Hello", twitter);
		
		greet.conveyGreetings("Hello All" , message -> System.out.println("Send over Network : " + message));
		
		// :: method reference operator
		Greetings randomRef = Sample :: staticRes;
		greet.conveyGreetings("Hello All", randomRef);
		
		Sample S1 = new Sample();
		Greetings randomInstRef = S1 :: instanceRes;
		greet.conveyGreetings("Hello All", randomInstRef);
		
		greet.conveyGreetings("Hello All", S1 :: instanceRes);
		
						     
	}

}
