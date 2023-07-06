# Test Documentation
# 1. Introduction
While testing can be done through print statements and console logs, testing documentation which outlines information regarding the process is extremely important. This document discusses the test strategy, test cases, test data, and summary report. Note that this is a working document and will be updated concurrently during development and testing of the classifier.

# 2. Test Strategy
There are many different types of strategies regarding how to test, what to test, and so on. Due to the scale of this project, I have limited our testing strategies to three possible types, which are the following.

### 2.1 Black box testing
Black box testing revolves around having no knowledge of how the code operates. Therefore we cannot hold any assumptions such as a method being present and so on. The only thing we consider is the input and output behaviour. Black box testing is ideal for input validation tests, however it can be difficult to achieve high code coverage and find bugs specific to the classifier's implementation.

### 2.2 White box testing
White box testing assumes we have full access to the source code. This means we can access implementation details, parameters, arguements, datatypes and so on. By understanding the full source code we can specifically target our tests to achieve a high code coverage as well as cover implementation specific bugs. Disadvantages of white box testing are that it is relatively difficult and intensive to create high quality tests as high code coverage does not necessarily mean high quality testing. This type of testing also assumes that the implementation of the classifier is correct, and may overlook implementation issues.

### 2.3 Grey box testing
Grey box testing is a combination of both black and white, where we can have certain assumptions regarding the code. For example, we may know that certain methods exist and what the method's purpose is, but we would not directly know all the constants, parameters and arguments within that method. The advantages of grey box testing revolves around creating better test case designs. This is due to our limited understanding of the implementation, so we are not "overload" with variables compared to white box testing. Grey box also allows us to consider implementation specific bugs as well as input and output behaviour. Unforunately, working with limited understanding has its difficulties, as while we can create better test case designs, it can be difficult creating those designs as we need to ensure we strike a balance between what we can assume about the system (white box) and testing for the unknown (black box).

For the purposes of this classifier, I have decided to go with grey box testing. This gives us a good balance between creating high quality tests as well as accounting for the unknown. While there may be difficulty in ensuring we strike a good balance between those two aspects, I have decided to mitgate that risk by creating the tests first, and then, create the classifer.

# 3. Test Cases

# 4. Test Data

# 5. Summary Report

Last Updated: 06/07/2023

