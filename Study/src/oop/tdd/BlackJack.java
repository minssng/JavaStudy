package oop.tdd;

public class BlackJack {
	
	
	
	// ������ ���̸Ӵ� ī�带 �ϳ��� �̾� ���� 2���� ī�带 ����
	// ���̸Ӵ� �󸶵��� ī�带 �߰��� ���� �� ����.
	// ������ 2ī���� �հ� ������ 16�� �����̸� �ݵ�� 1���� �߰��� �̰�, 17�� �̻��̸� �߰��� �� ����.
	// ���ʴ� �߰� �̱� ����, ī�带 �����ϸ� ������ ���̸� �� ������ ī���� ���� 21�� ���� ����� ���� �¸�
	// �� 21�� �ʰ��ϸ� �ʰ��� ���� ��.
}

//����, ���̸� 
class Gamer{
	int nums;
	
	Gamer(){
		nums = 0;
	}
	
	// ī��̱�
	public void pickCard(Card card){
		nums += card.getNum();
	}
}

class Card{
	int num;
	int shape;
	// ī��� ��Ŀ�� ������ 52��(ī��� ���̾Ƹ��,��Ʈ,�����̵�,Ŭ�ι�,A ~ K)
	// 2~ 10 ����, K/Q/J 10�� 
	
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