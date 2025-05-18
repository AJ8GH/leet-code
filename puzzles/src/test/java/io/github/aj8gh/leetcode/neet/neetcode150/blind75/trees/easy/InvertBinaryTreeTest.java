package io.github.aj8gh.leetcode.neet.neetcode150.blind75.trees.easy;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.aj8gh.leetcode.model.TreeNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class InvertBinaryTreeTest {

  private final InvertBinaryTree subject = new InvertBinaryTree();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(
            TreeNode.from(1, 2, 3, 4, 5, 6, 7),
            TreeNode.from(1, 3, 2, 7, 6, 5, 4)),
        Arguments.of(
            TreeNode.from(3, 2, 1),
            TreeNode.from(3, 1, 2)));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(TreeNode root, TreeNode expected) {
    var actual = subject.solve(root);
    assertThat(actual).isEqualTo(expected);
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void testRecursive(TreeNode root, TreeNode expected) {
    var actual = subject.solveRecursively(root);
    assertThat(actual).isEqualTo(expected);
  }
}
