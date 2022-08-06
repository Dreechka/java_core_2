package lesson_8.intermediate.task_1;

public class Homework_8_intermediate_task_1 {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        // И у каждого массива вызвать характерный метод
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести
        Rose rose = new Rose();
        Smellable[] smellable = new Smellable[]{new Pine(true), new Fir(true), rose};
        for (Smellable tree : smellable) {
            tree.canSmell();
        }

        Bloomable[] bloomable = new Bloomable[]{rose, new Fern()};
        for (Bloomable plant : bloomable) {
            plant.canBloom();
        }
    }
}
