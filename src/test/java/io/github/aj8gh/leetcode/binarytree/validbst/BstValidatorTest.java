package io.github.aj8gh.leetcode.binarytree.validbst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.binarytree.TreeNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BstValidatorTest {
  private BstValidator bstValidator;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            true
        ),
        Arguments.of(
            new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6))),
            false
        ),
        Arguments.of(
            new TreeNode(2, new TreeNode(2), new TreeNode(2)),
            false
        ),
        Arguments.of(
            new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7))),
            false
        )
    );
  }

  @BeforeEach
  void setUp() {
    bstValidator = new BstValidator();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void removeNthNodeFromEnd(TreeNode root, boolean expectedOutput) {
    var actualOutput = bstValidator.isValidBST(root);
    assertEquals(expectedOutput, actualOutput);
  }
}
