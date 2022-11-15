import unittest
import task1


class TestTask1(unittest.TestCase):

    def test_count_smile_1(self):
        example_text = r'привет :-{\, как дела, :-{\\?'
        expected_smile_count = 2
        self.assertEqual(task1.count_smiles(example_text), expected_smile_count)

    def test_count_smile_2(self):
        example_text = r'привет :-{- -\, как дела, :-{\\?'
        expected_smile_count = 1
        self.assertEqual(task1.count_smiles(example_text), expected_smile_count)

    def test_count_smile_3(self):
        example_text = r'привет :-{\, как дела, :-{?'
        expected_smile_count = 1
        self.assertEqual(task1.count_smiles(example_text), expected_smile_count)

    def test_count_smile_4(self):
        example_text = r'привет :-{\:-{\, как дела, :-{\\?'
        expected_smile_count = 3
        self.assertEqual(task1.count_smiles(example_text), expected_smile_count)

    def test_count_smile_5(self):
        example_text = r'privet ::-{/\, kak dela, :-{\\'
        expected_smile_count = 1
        self.assertEqual(task1.count_smiles(example_text), expected_smile_count)


if __name__ == '__main__':
    unittest.main()
