package io.github.aj8gh.leetcode.neet.neetcode150.blind75.trees.easy;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.aj8gh.leetcode.model.TreeNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximumDepthOfBinaryTreeTest {

  private final MaximumDepthOfBinaryTree subject = new MaximumDepthOfBinaryTree();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(TreeNode.from(1, 2, 3, null, null, 4), 3),
        Arguments.of(TreeNode.from(1, 2, 3, 4, null, null, 5), 3),
        Arguments.of(TreeNode.from(1), 1),
        Arguments.of(null, 0));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(TreeNode root, int expected) {
    var actual = subject.solve(root);
    assertThat(actual).isEqualTo(expected);
  }
}
