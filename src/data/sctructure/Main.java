package data.sctructure;

public class Main {
    
    MyStack<String> stack = new MyStack<>();

    public static void main(String[] args) {
        Main app = new Main();
	app.stackCards();
        app.unstackCards();
		
	//reinicia el mazo de cartas
	app.stackCards();
		
	//cuantas cartas hay en el mazo
	app.desckSize();
		
        //esta presente en el mazo la carta "Queen of Hearts"
	app.containsCard("Queen of Hearts");

	//esta presente en el mazo el "Joker"
	app.containsCard("Joker");

	//ir al "King of Diamonds"
	app.goToCard("King of Diamonds");

	//cuantas cartas hay en el mazo
	app.desckSize();
    }
    
    public void stackCards() {		
		//apilar las cartas de tipo Spade
		stack.push("Ace of Spades");
		stack.push("2 of Spades");
		stack.push("3 of Spades");
		stack.push("4 of Spades");
		stack.push("5 of Spades");
		stack.push("6 of Spades");
		stack.push("7 of Spades");
		stack.push("8 of Spades");
		stack.push("9 of Spades");
		stack.push("10 of Spades");
		stack.push("Jack of Spades");
		stack.push("Queen of Spades");
		stack.push("King of Spades");

		//Apilar las cartas de tipo Diamonds
		stack.push("Ace of Diamonds");
		stack.push("2 of Diamonds");
		stack.push("3 of Diamonds");
		stack.push("4 of Diamonds");
		stack.push("5 of Diamonds");
		stack.push("6 of Diamonds");
		stack.push("7 of Diamonds");
		stack.push("8 of Diamonds");
		stack.push("9 of Diamonds");
		stack.push("10 of Diamonds");
		stack.push("Jack of Diamonds");
		stack.push("Queen of Diamonds");
		stack.push("King of Diamonds");

		//apilar las cartas de tipo Club
		stack.push("Ace of Clubs");
		stack.push("2 of Clubs");
		stack.push("3 of Clubs");
		stack.push("4 of Clubs");
		stack.push("5 of Clubs");
		stack.push("6 of Clubs");
		stack.push("7 of Clubs");
		stack.push("8 of Clubs");
		stack.push("9 of Clubs");
		stack.push("10 of Clubs");
		stack.push("Jack of Clubs");
		stack.push("Queen of Clubs");
		stack.push("King of Clubs");

		//apilar las cartas de tipo corazon
		stack.push("Ace of Hearts");
		stack.push("2 of Hearts");
		stack.push("3 of Hearts");
		stack.push("4 of Hearts");
		stack.push("5 of Hearts");
		stack.push("6 of Hearts");
		stack.push("7 of Hearts");
		stack.push("8 of Hearts");
		stack.push("9 of Hearts");
		stack.push("10 of Hearts");
		stack.push("Jack of Hearts");
		stack.push("Queen of Hearts");
		stack.push("King of Hearts");
	}
	
	public void unstackCards() {			
            //sacas las cartas de mazo e imprime su valor
            while(stack.size() > 0) {
                System.out.println(stack.pop());
            }
	}

	public void containsCard(String card) {			
            System.out.println(stack.contains(card));
	}

	public void goToCard(String card) {			
            System.out.println(stack.access(card));
	}

	public void desckSize() {			
            System.out.println(stack.size());
	}
}