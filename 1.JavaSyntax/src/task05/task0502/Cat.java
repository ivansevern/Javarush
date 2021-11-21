package com.javarush.task1kurs.task05.task0502;

/**
 * Реализуй метод boolean fight(Cat anotherCat)
 * Подумай механизм драки котов в зависимости от их веса, возвраста и силы
 * Сравни каждый критерий по отдельности, чтобы победил у кого больше критериев лучше
 * Метод должен определять, выиграли ли мы (this) бой или нет true - при победе, False - если проиграли
 * если ничья false+++
 */
public class Cat {
    public int age;
    public int weight;
    public int strenght;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write this code
/*compare - сравнивает(x, y)
если (x==y) - возвращает 0
     (x<y) - возвращает -1
     (x>y) - возвращает 1
 */

      int ageCount = Integer.compare(this.age, anotherCat.age);
      int weightCount = Integer.compare(this.weight, anotherCat.weight);
      int strenghtCount = Integer.compare(this.strenght, anotherCat.strenght);

      int count = ageCount + weightCount + strenghtCount;
      return  count >0;

    }


    public static void main(String[] args) {
    }


}


