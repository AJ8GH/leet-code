package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.model.TreeNode;
import io.github.aj8gh.leetcode.test.AbstractTreeNodeTest;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BinaryTreeMergerTest extends AbstractTreeNodeTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            tn(1, tn(3, tn(5), null), tn(2)),
            tn(2, tn(1, null, tn(4)), tn(3, null, tn(7))),
            tn(3, tn(4, tn(5), tn(4)), tn(5, null, tn(7)))
        ),
        Arguments.of(
            tn(1),
            tn(1, tn(2), null),
            tn(2, tn(2), null)
        )
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void mergeTrees(TreeNode root1, TreeNode root2, TreeNode expected) {
    var binaryTreeMerger = new BinaryTreeMerger();
    var actual = binaryTreeMerger.mergeTrees(root1, root2);
    assertEquals(expected, actual);
  }
}
