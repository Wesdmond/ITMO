import unittest

import task2


class TestTask2(unittest.TestCase):

    def test_check_hayku_1(self):
        example_text = r'Вечер за окном. / Еще один день прожит./ Жизнь скоротечна...'
        self.assertEqual(task2.check_hayku(example_text), 'Хайку!')

    def test_check_hayku_2(self):
        example_text = r'Просто текст/'
        self.assertEqual(task2.check_hayku(example_text), 'Не хайку. Должно быть 3 строки.')

    def test_check_hayku_3(self):
        example_text = r'Как вишня расцвела! / Она с коня согнала/И князя-гордеца'
        self.assertEqual(task2.check_hayku(example_text), 'Не хайку.')

    def test_check_hayku_4(self):
        example_text = r'Приглашаем вас, / Посетите златый зал. / Вам понравится.'
        self.assertEqual(task2.check_hayku(example_text), 'Хайку!')

    def test_check_hayku_5(self):
        example_text = r'И вот, однажды, / Любви всей жизни не найдя/ Князь бросился с крыльца'
        self.assertEqual(task2.check_hayku(example_text), 'Не хайку.')


if __name__ == '__main__':
    unittest.main()
