import unittest
import task3


class TestTask3(unittest.TestCase):

    def test_check_email_1(self):
        example_text = r'students.spam@yandex.ru'
        self.assertEqual(task3.check_email(example_text), 'yandex.ru')

    def test_check_email_2(self):
        example_text = r'example@example'
        self.assertEqual(task3.check_email(example_text), 'Fail!')

    def test_check_email_3(self):
        example_text = r'just.test@itmo.ru'
        self.assertEqual(task3.check_email(example_text), 'itmo.ru')

    def test_check_email_4(self):
        example_text = r'example@example.com.org.ru'
        self.assertEqual(task3.check_email(example_text), 'Fail!')

    def test_check_email_5(self):
        example_text = r'example@example@yandex.com'
        self.assertEqual(task3.check_email(example_text), 'Fail!')

    def test_check_email_6(self):
        example_text = r'._._@yandex.com'
        self.assertEqual(task3.check_email(example_text), 'yandex.com')


if __name__ == '__main__':
    unittest.main()
