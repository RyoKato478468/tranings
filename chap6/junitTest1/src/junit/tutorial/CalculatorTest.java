package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	//@Testアノテーションを付けることでテストメソッド化できる
	@Test
	public void maltiplicationで5と2の乗算結果が取得できる() throws Exception {
		Calculator sut = new Calculator();			//テスト対象クラスのインスタンス
		int expected = 10;							//予想される実行結果
		int acutual = sut.maltiplication(5, 2);	//実行するメソッド名と引数
		assertThat(acutual, is(expected));			//検証 assertThat(実行するメソッド名と引数, is(予想される実行結果))
    }
	
	@Test
	public void divisionで5と8の乗算結果を表示できる() throws Exception{	
		Calculator sut = new Calculator();
		float expected = 0.625f;
		float actual = sut.division(5, 8);
		assertThat(actual, is(expected)); 
		
	}
}
