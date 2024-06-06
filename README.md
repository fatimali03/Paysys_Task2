**PAYSYS TASK 2**

**CODE Implemented in Java**
![image](https://github.com/fatimali03/Paysys_Task2/assets/136559675/56f5e7dd-94ae-4dd2-a6da-843c2c105d35)

**Unit Testing**

![image](https://github.com/fatimali03/Paysys_Task2/assets/136559675/a2d05436-b7ad-4f76-9f04-f9f0ed58e032)

**CI/CD PIPELINE (Implemented using GitHub Actions)**
![image](https://github.com/fatimali03/Paysys_Task2/assets/136559675/49a2b95c-329e-41a4-8779-4d29060318ca)

-The .github/workflows/ directory defines the CI/CD pipeline steps to automatically run the unit tests whenever changes are pushed to the repository.

**Checkout Code:**

-This step fetches the code from the repository so that the workflow can access it.

**Set up JDK:**

-It configures the environment to use Java, specifically version 17, ensuring that the correct version is available for compiling and running the Java tests.

**List files:**

-This step lists all files in the repository, helping to verify the directory structure and file locations.

**Compile and run tests:**

-In this step, the Java files OutputCalculator.java and TestCalculateOutput.java are compiled, and then the tests are executed using the Java runtime (java command).

**Upload test results:**

-The test results, typically saved in a file named test-results.xml, are uploaded as an artifact. This allows viewing the results in the GitHub Actions interface, aiding in debugging and analysis.
**Github Action**
![image](https://github.com/fatimali03/Paysys_Task2/assets/136559675/48f1c515-53ac-4a6e-91ba-609eb19b360d)

**Run Test Cases**
![image](https://github.com/fatimali03/Paysys_Task2/assets/136559675/a03b01ff-a546-47ee-a0cf-b2ae6c342353)

**Bonus: Add Sonarqube in the pipeline to give you a code quality score.**
