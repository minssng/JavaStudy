package oop.tdd;

public class BlackJack {
	
	
	
	// 딜러와 게이머는 카드를 하나씩 뽑아 각자 2개의 카드를 소지
	// 게이머는 얼마든지 카드를 추가로 뽑을 수 있음.
	// 딜러는 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 추가할 수 없음.
	// 양쪽다 추가 뽑기 없이, 카드를 오픈하면 딜러와 게이머 중 소유한 카드의 합이 21에 가장 가까운 쪽이 승리
	// 단 21을 초과하면 초과한 쪽이 짐.
}

//딜러, 게이머 
class Gamer{
	int nums;
	
	Gamer(){
		nums = 0;
	}
	
	// 카드뽑기
	public void pickCard(Card card){
		nums += card.getNum();
	}
}

class Card{
	int num;
	int shape;
	// 카드는 조커를 제외한 52장(카드는 다이아몬드,하트,스페이드,클로버,A ~ K)
	// 2~ 10 숫자, K/Q/J 10점 
	
	public Card(int num, int shape) {
		super();
		this.num = num;
		this.shape = shape;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Card [num=" + num + ", shape=" + shape + "]";
	}
}