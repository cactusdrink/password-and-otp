# Password and OTP Generation in Java

This repository contains Java programs for generating passwords and OTPs.

## Directory Structure

- `src/password/`
  - `RandomPasswordGenerator.java`: Generates random passwords with various characters.
  - `UniquePasswordGenerator.java`: Generates unique passwords based on ASCII values.
  
- `src/otp/`
  - `RandomOTPGenerator.java`: Generates random OTPs with specified length.
  - `SimpleOTPGenerator.java`: Generates a simple 4-digit OTP.

## How to Run

1. Compile the Java files using:
javac src/password/.java src/otp/.java

arduino
Copy code

2. Run the Java classes using:
java password.RandomPasswordGenerator java password.UniquePasswordGenerator java otp.RandomOTPGenerator java otp.SimpleOTPGenerator

markdown
Copy code

## Notes

- The generated passwords and OTPs will change each time the programs are run.
- Ensure you have the Java Development Kit (JDK) installed to compile and run these programs.