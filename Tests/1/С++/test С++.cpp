#include <iostream>
#include <windows.h>

using namespace std;

int main()
{
    SetConsoleCP(65001);
    SetConsoleOutputCP(65001);

    const X_RANGE_MIN = -1000; 
    const y_range_min = -1000; 
    const x_range_max =  1000; 
    const y_range_max =  1000;

    long double x, y, yMax;
    bool correct;

    cout << "Даны координаты точки М(х,у). Определите, принадлежит, ли данная точка замкнутомуmмножеству D." << endl;

    correct = true;
    while (correct)
    {

        cout << "Введите x: ";
        cin >> x;

        if (cin.fail())
        {
            cout << "Вы ввели неверный тип даннх." << endl;
            cin.clear();
            while (cin.get() != '\n')
            {
            }
        } 
        else 
        {
            if (x > x_range_max || x < X_RANGE_MIN)
                cout << "Значение x выходит за рамки ограничения." << endl;
            else
                correct = false;
        }
    }

    correct = true;
    while (correct)
    {

        cout << "Введите y: ";
        cin >> y;

        if (cin.fail())
        {
            cout << "Вы ввели неверный тип даннх." << endl;
            cin.clear();
            while (cin.get() != '\n')
            {
            }
        }
        else
        {
            if (y > y_range_max || y < y_range_min)
            {
                cout << "Значение y выходит за рамки ограничения." << endl;
            }
            else
            {
                correct = false;
            }
        }
    }

    if (x <= 2 && x >= 0)
    {
        yMax = (-1) * 0.5 * x + 1;
        if (y >= 0 && y <= yMax)
        {
            cout << "Точка M принадлежит D";
        }
        else
        {
            cout << "Точка M не принадлежит D";
        }
    }
    else
    {
        cout << "Точка M не принадлежит D" << endl;
    }
    return 0;
}
