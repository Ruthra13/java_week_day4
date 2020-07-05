![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | Star Force Enterprise

## A Quick Introduction

Space is Amazing! Isn't it?

The sheer vastness of it, along with the trillions upon trillions of objects in the many billion galaxies of the universe is almost incomprehensible to the human brain. But sadly, majority of us have not had the opportunity to explore the beyond. 

Not the case any more.

You don’t need to be a superman or superwoman to fly into space! The FACE Space Force Enterprise has announced the creation of a revolutionary space research agency called the Star Force Enterprise.

As a ProGrad, you get an opportunity to get into space (Conditions Apply).

Wondering what those conditions are? You gotta help us with the below implementation to grab this opportunity.

## What should you do
```
Fork this repo
Clone this repo
Practice Java basics - operators, conditions, loops, class and object
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions

1. ***Do not modify the entire code.***
2. ***Edit the code as per the instructions.***
3. ***Go to Java Resources -> src folder.***
4. ***You will have 3 packages src/controller, src/utility, src/model.***
5. ***Once the progressions are completed, follow the instructions to run the application and test your code.***
 
## Run the Project
1. ***Right click on the project.***
2. ***Go to Run as -> Run on server.***
3. ***You can check the output in eclipse browser or in your browser.***

## Input Format
1. ***There are 2 sets of inputs to this application.***
2. ***First set of inputs are user details - name, number, age, height, weight and country.***
3. ***Second set of input is the total of the all the answers to the quiz.***
4. ***The quiz answer is a number which of type String.***


## Output Format
1 ***Output is a boolean value true or false.***


## Progression - 1 
1. ***Create a class called User inside the model package with the following arguments***
   - ***private String name***
   - ***private String number***
   - ***private int age***
   - ***private int height***
   - ***private int weight***
   - ***private String country***
2. ***Generate appropriate getters and setters.***
3. ***Generate the constructor User (String name, String number, int age, int height, int weight, String country) inside the User class.***

## Progression - 2
1. ***Create an Abstract class BasicEligibility in the utility package***
2. ***Create an abstract method - abstract boolean basicEligibilityCheck (User user)***

## Progression - 3
1. ***Create an interface EligibilityInterface in the utility package***
2. ***Create a method in interface - boolean checkUser (User user)***
3. ***Create a method in interface - boolean checkQuizAnswer (String points)***

## Progression - 4
1. ***Create a class called EligibilityCheck which extends the abstract class BasicEligibility and implements EligibilityInterface***
2. ***Implement the method basicEligibilityCheck (User user)***
3. ***The basicEligibilityCheck method should in turn invoke checkUser(User user)***
4. ***Return true if the candidate is eligible for space journey, return false otherwise.***

## Progression - 5
1. ***checkUser(User user) method is used to check whether the user is eligible for space journey or not.***
2. ***A person is eligible if his (18 <= age <= 35, (155 <=height<=170 ) , (55<= weight <= 90) and Country == ProGrad.***
3. ***Return true if the person is eligible and return false otherwise.***

## Progression - 6
1. ***checkQuiz(String points) method is used to check whether the candidate has cleared the assessment or not.***
2. ***A candidate clears the test only if he scores more than 80.***
3. ***Return true if he scores more than 80 else false.***
4. ***Convert the String to an Integer.***

## Progression - 7
1. ***Create an object for the User class and pass the input arguments to the contructor.***
2. ***Create an object for the EligibilityCheck class in EligibilityViewController.***
3. ***Call the basicEligibilityCheck(user) method with the object created.***
4. ***Store the return value in a boolean variable spaceEligible.***
5. ***Create an object for the EligibilityCheck class in Eligibility.***
3. ***Call the checkQuizAnswers(String points) method with the object created.***
4. ***Store the return value in a boolean variable spaceEligible.***


Happy Coding ProGrad ❤️
