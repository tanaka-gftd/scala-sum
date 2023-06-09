//2-6中級 コマンドライン引数で複数の数値を渡し、それらの和を返す

//わからなかったので、解答を参考にした

object Main extends App {
  /* 
    •args...コマンドライン引数を受け取って格納される
    •mapメソッド...与えられたコレクションの各要素に、処理を加えて、新しいコレクションを返す
    •toIntメソッド...与えられた数をInt型に変換
    •sumメソッド...コレクション内の全ての要素(数値)の和を返す 
    (例)  List(1, 3, 5).sum  → 9

    •_(アンダーバー)...scalaにおけるアンダーバーには様々な用途があるが、ここでは無名関数の省略形を表す
    (例)  List(1, 3, 5).map((x) => x * 3)  → List(3, 9, 15)
              ↓
          1：List(1, 3, 5).map(_*(3))  → List(3, 9, 15)
          2：List(1, 3, 5).map(_*3)  → List(3, 9, 15)
          3：List(1, 3, 5).map(_.*(3))  → List(3, 9, 15)
          4：List(1, 3, 5).map(_.*3)  → NG

　　　　　　1,2,3いずれも、List(3, 9, 15) となる
          なお、scalaにおいては演算子もメソッド扱い(演算子に続く値は引数扱い)なので、
          3のようにドットを挟むこともできるが、ドットを挟んだ場合は()を省略できない(4の書き方はNG)
   */
  println(args.map(_.toInt).sum)  //アンダーバーで無名関数を省略している
  //println(args.map(num => num.toInt).sum)  //アンダーバーを使わない場合
}