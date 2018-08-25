package string.lang;
import java.util.Date;

//Our Template for Immutable Classes
//Now we have a template for creating immutable objects.
//Make all fields private
//Don't provide mutators
//Ensure that methods can't be overridden by either making the class final (Strong Immutability) or making your methods final (Weak Immutability)
//If a field isn't primitive or immutable, make a deep clone on the way in and the way out.
//


	public final class ImmutableClassImpl
	{
		private String firstName;
		private String lastName;
		private Date dob;

		public ImmutableClassImpl( String firstName,
		  String lastName, Date dob)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.dob = new Date( dob.getTime() );
		}
		
		public static void main(String[] args) {
			ImmutableClassImpl myPerson =  new ImmutableClassImpl( "David", "O'Meara", new Date() );
					System.out.println( myPerson.getDOB() );
					Date myDate = myPerson.getDOB();
					myDate.setMonth( myDate.getMonth() + 1 );
					System.out.println( myPerson.getDOB() );
		}
	
				
				public Date getDOB()
				{
					return new Date( this.dob.getTime() );
				}
				
}