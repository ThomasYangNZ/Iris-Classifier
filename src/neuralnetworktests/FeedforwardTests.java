package neuralnetworktests;

import static org.junit.Assert.assertEquals;

import neuralnetworkcore.NeuralNetwork;
import org.junit.jupiter.api.Test;

/**
 * These sets of tests are primarily devoted to ensuring the feedforward 
 * phase of neural network training is valid.
 *
 * @author Thomas
 */
public class FeedforwardTests {
  
  // Following elements are required for initialisation but not important for feedforward test
  private static final double LEARNING_RATE = 0.2;
  
  // Corresponding nodes
  private static int numInputNode = 2;
  private static int numHiddenNode = 1;
  private static int numOutputNode = 1;
  
  // Weights from input layer to hidden layer
  private static double[][] hiddenLayerWeights = {
      {1.0},
      {1.0}
  };
  
  // Weights from hidden layer to output layer
  // NOTE: For this, we are simulating an XOR situation
  // from the famous perceptron convergence theorem. So the two input nodes
  // also have additional links to the output nodes.
  private static double[][] outputLayerWeights = {
      {1.0},
      {-2.0},
      {1.0}
  };
  
  // Hidden layer bias
  private static double[][] hiddenLayerBias = {
      {1.5}
  };
  
  // Output layer bias
  private static double[][] outputLayerBias = {
      {0.5}
  };
  
  // Create a neural network using our testing characteristics
  private static NeuralNetwork nn = new NeuralNetwork(numInputNode, numHiddenNode, numOutputNode,
      hiddenLayerWeights, outputLayerWeights, LEARNING_RATE, hiddenLayerBias, 
      outputLayerBias);
  
  @Test
  public void test01() {
    // Simulate the XOR logic gate with an input of 0, 0
    double[] inputs = {0, 0};
    // XOR logic gate outpus 0, given 0, 0
    assertEquals(0, nn.feedforward(inputs));
  }
  
  @Test
  public void test02() {
    // Simulate the XOR logic gate with an input of 1, 0
    double[] inputs = {1, 0};
    // XOR logic gate outpus 1, given 1, 0
    assertEquals(1, nn.feedforward(inputs));
  }
  
  @Test
  public void test03() {
    // Simulate the XOR logic gate with an input of 0, 1
    double[] inputs = {0, 1};
    // XOR logic gate outpus 1, given 0, 1
    assertEquals(1, nn.feedforward(inputs));
  }
  
  @Test
  public void test04() {
    // Simulate the XOR logic gate with an input of 1, 1
    double[] inputs = {1, 1};
    // XOR logic gate outpus 0, given 1, 1
    assertEquals(0, nn.feedforward(inputs));
  }
}
