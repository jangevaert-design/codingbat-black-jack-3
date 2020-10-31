public class BlackJack3 {
  public int blackjack(int a, int b) {
    if (a > 21 && b > 21) {
      return 0;
    } else if (a > 21 || b > 21) {
      return Math.min(a, b);
    } else {
      return Math.max(a, b);
    }
  }
}
