package simpleprograms;

import org.testng.annotations.Test;

public class grouping {
	@Test (groups = { "sanity" })

	  public void sanity1() {

		  System.out.println("Batch Car - Test car 1");

	  }

	  @Test (groups = { "sanity" })

	  public void sanity2() {

		  System.out.println("Batch Car - Test car 2");

	  }

	  @Test (groups = { "regression" })

	  public void Scooter1() {

		  System.out.println("Batch Scooter - Test scooter 1");

	  }

	  @Test (groups = { "regression" })

	  public void Scooter2() {

		  System.out.println("Batch Scooter - Test scooter 2");

	  }

	  @Test (groups = { "sanity", "Sedan Car" })

	  public void Sedan1() {

		  System.out.println("Batch Sedan Car - Test sedan 1");

	  }
}
