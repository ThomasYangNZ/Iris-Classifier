# Project Requirements
# 1. Introduction
This project aims to create a reusable classification model which is not only limited to the iris dataset. In doing so, a series of tests will also be added to ensure that during modification the general logic and other factors of the classification model is still correct.

### 1.1 Purpose
To create a classification model which takes in feature values from the iris dataset, and outputs a predicated iris species.

### 1.2 Scope
The scope of the Iris-Classifier revolves around catergorising iris plants into their three respective species based off features provided by the iris dataset. While there are numerous external libraries that can achieve this with relative ease such as NeuPy, or sklearn and so on, this would not be in the spirit of learning. Therefore, we will not use external libraries which "hide" the actual classification process, hwoever, we will accept using external libraries for things such as file reading, testing and other possibly tasks not directly related to the classification.

### 1.3 Product Overview
There are many classification models which, given feature values, are able to provide a predicted output such as decision trees, k-nearest neighbour, random forest, naive bayes, neural network, and so on. To match our goals, this classifier should be easily customisable, give accurate predictions, and should be able to be tested.

#### 1.3.1 Product Functions
In light of our product overview, our classifier should have the following functionality:
1. Adjustable values to increase predication accuracy
2. Handle categorical and continuous data
3. Produces a classifier which is testable e.g, input value outputs the same output value
4. Classifier should be easily adjustable from one dataset to another dataset

# 2. Specific Requirements
Based off the product functions we have a more focused view of what is required from our classifier, as a result, we are able to create concrete requirements. Based off prior knowledge and additional research, the classifier we will be utilising is a neural network. From here, we will be able to discuss the functional requirements in more depth.

### 2.1 Functional Requirements
### Adjustable values to increase predication accuracy
Neural networks have a large number of tools available to them to increase predication accuracy. In this project, I will be utilising bias, learning rate, and momentum.
1. Bias
Bias acts as a “shift” for the neural network’s activation function. This gives us another way to manipulate the weighted sum as opposed to solely relying on changing weights.
2. Learning Rate
Learning rate dictates how big of a “step” our neural network takes when changing weights and biases. A large learning rate leads to oscillations when calculating weight changes, however, a small learning rate may prevent convergence, or increase time spent converging. Finding the “correct” learning rate, which is in between these two extremes, tends to be difficult. 
3. Momentum
Momentum is a value which “remembers” the size previous changes in weights and biases and adjusts the current changes accordingly. For example, if consecutive weight changes tend to decrease the weights, momentum will decrease the weight more to speed up the learning process. If consecutive weight changes are oscillating (increasing, then decreasing, then increasing), momentum decreases the size of the change to get closer to the appropriate weight.
### Handle categorical and continuous data
This requirement is easy to fulfil as we can encode categorical data. In terms of continuous data, neural networks naturally utilise continuous data, so there will be no issues in terms of handling it.
### Produces a classifier which is testable e.g, input value outputs the same output value
Neural networks fulfil this condition of testability. This is because we can modulate our neural network classifier to conduct feedforwards, and/or back propagation only once. Therefore, we can have pre-calculated scenarios and given number of nodes, weights, biases, and so on, we can always expect the same output.  
### Classifier should be easily adjustable from one dataset to another dataset
This requirement is slightly difficult to fulfil in terms of a neural network. As, for example, the number of input nodes changes corresponding to the number of feature values. However, with careful coding, we can generate code which takes in number of feature values, and can output a corresponding neural network which fits the needs to the dataset.

### 2.2 Usability Requirements
The project will be uploaded to GitHub with its corresponding readme files as well as documentation. Since this program is solely for my own education, no additional user interfaces are required. The documentation, combined with GitHub issues, milestones, and comments should provide enough background on the classifier that it should be understandable. 

# 3. Verification
The overall process of verification is to ensure the classifier being built is compliant with the requirements as stated in this document. Typically, verification would be an important step in a group environment, however, due to the fact I will solely be working on this project by myself, verification will be done through self-inspections and reflections during the programming phase.  

Last Updated: 28/06/2023
