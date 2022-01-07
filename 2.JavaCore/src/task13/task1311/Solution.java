package task1311;

/*
* 1. Создать класс EnglishTranslator, который наследуется от Translator
* 2. Реализовать все абстрактные методы
* 3. Сделать так, чтобы программа выводила:
* Я переводчик с английского - путем вызова метода translate у объекта типа EnglishTranslator
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

    public static class EnglishTranslator extends Translator {
        @Override
        public String getLanguage() {
            return "английского";
        }
    }
}
