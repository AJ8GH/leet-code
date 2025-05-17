package io.github.aj8gh.leetcode.leet.binarytree.validbst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.model.TreeNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BstValidatorTest {

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

  @Disabled("Not ready")
  @ParameterizedTest
  @MethodSource("inputProvider")
  void isValidBst(TreeNode root, boolean expectedOutput) {
    var bstValidator = new BstValidator();
    var actualOutput = bstValidator.isValidBst(root);
    assertEquals(expectedOutput, actualOutput);
  }
}
