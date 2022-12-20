package OOP.Lessons.Lesson2.Ex006.Interface;

import OOP.Lessons.Lesson2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
