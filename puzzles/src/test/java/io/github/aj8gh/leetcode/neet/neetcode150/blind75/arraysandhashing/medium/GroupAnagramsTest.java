package io.github.aj8gh.leetcode.neet.neetcode150.blind75.arraysandhashing.medium;

import static java.util.stream.Collectors.toSet;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GroupAnagramsTest {

  private final GroupAnagrams subject = new GroupAnagrams();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(
            new String[] {"act", "pots", "tops", "cat", "stop", "hat"},
            List.of(List.of("hat"), List.of("act", "cat"), List.of("stop", "pots", "tops"))),
        Arguments.of(new String[] {"x"}, List.of(List.of("x"))),
        Arguments.of(new String[] {""}, List.of(List.of(""))));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(String[] strs, List<List<String>> expected) {
    var actual = subject.solve(strs);
    assertThat(actual).hasSameSizeAs(expected);
    assertThat(toSets(actual)).isEqualTo(toSets(expected));
  }

  private Set<Set<String>> toSets(List<List<String>> lists) {
    return lists.stream()
        .map(HashSet::new)
        .collect(toSet());
  }
}
