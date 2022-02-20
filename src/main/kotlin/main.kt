fun main() {
//    // 1:start
//	println("Hello Kotlin")
//
//	// 2:valの使用(再代入不可)
//	val valText: String = "Hello Kotlin Text"
//	println(valText)
//	// 再代入不可
//	//valText = "newValString"
//
//	// 3:varの使用（再代入可）
//	var varText: String = "varString"
//	println(varText)
//	// 再代入
//	varText = "newVarString"
//	println(varText)
//
//	// 4:型推論
//	var num: Int = 1 // 型定義
//	println(num.javaClass)
//	var number = 3 // 型推論
//	println(number.javaClass)
//
//	// 5:関数の呼び出し
//	printText() // 引数,戻り値なし
//	printText1("String", 12) // 引数あり
//	val text2: String = printText2() // 戻り値あり
//	println(text2)
//	val text3: String = printText3("文字", 123) //引数あり、戻り値あり
//
//	// 6:if文, when文
//	if (num < 100) {
//		println("Less than 100")
//	} else if (num == 100) {
//		println("Equals to 100")
//	} else {
//		println("Over than 100")
//	}
//
//	when {
//		num < 100 -> println(" < 100")
//		num == 100 -> println(" == 100")
//		num > 100 -> println(" > 100")
//	}
//
//	when (num) {
//		100 -> println("100")
//		200 -> println("200")
//	}

	// 7: for文
//	for (i in 1..10) {
//		println("i is $i")
//	}
//	for (i in 1 until 10 step 3) {
//		println("i is $i")
//	}

	// リスト
	val list: List<Int> = listOf<Int>(1,3,4,5,7,9)
	for (i in list) {
		println("i is $i")
	}

}

// 5:関数の呼び出し
fun printText() {
	val text = "Hello function text"
	println(text)
}

fun printText1(text: String, num: Int) {
	println(text)
	println(num)
}

fun printText2(): String {
	return "text2-string"
}

fun printText3(mozi: String, num: Int): String {
	return mozi + num.toString()
}
