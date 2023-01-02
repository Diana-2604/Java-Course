package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class NoteBooks {
    private ArrayList<Notebook> notebooks;

    public ArrayList<Notebook> getNotebooks() {
        return this.notebooks;
    }

    public void addNotebook(Notebook notebook) {
        if (this.notebooks == null) {
            this.notebooks = new ArrayList<>();
        }
        this.notebooks.add(notebook);
    }

    public void removeNotebook(Notebook notebook) {
        this.notebooks.remove(notebook);
    }

    public List<Notebook> getNotebooksByBrand(String brand) {
        // получение всех ноутбуков по бренду
        List<Notebook> result = new ArrayList<>();
        for (Notebook notebook : this.notebooks) {
            if (notebook.getBrand().toLowerCase().equals(brand.toLowerCase())) {
                result.add(notebook);
            }
        }
        return result;
    }

    public List<Notebook> getNotebooksByOS(String os) {
        // получение всех ноутбуков по OS
        List<Notebook> result = new ArrayList<>();
        for (Notebook notebook : this.notebooks) {
            if (notebook.getOS().toLowerCase().equals(os.toLowerCase())) {
                result.add(notebook);
            }
        }
        return result;
    }

    public List<Notebook> getNotebooksByCores(Integer minValue) {
        // получение всех ноутбуков по количеству ядер
        List<Notebook> result = new ArrayList<>();
        for (Notebook notebook : this.notebooks) {
            if (notebook.getCores() >= minValue) {
                result.add(notebook);
            }
        }
        return result;
    }

    public List<Notebook> getNotebooksByRAM(Integer minValue) {
        // получение всех ноутбуков по объему RAM
        List<Notebook> result = new ArrayList<>();
        for (Notebook notebook : this.notebooks) {
            if (notebook.getRAM() >= minValue) {
                result.add(notebook);
            }
        }
        return result;
    }

    public List<Notebook> getNotebooksBySensor(boolean sensor) {
        // получение всех ноутбуков по сенсорному экрану
        List<Notebook> result = new ArrayList<>();
        for (Notebook notebook : this.notebooks) {
            if (notebook.getSensor() == sensor) {
                result.add(notebook);
            }
        }
        return result;
    }

    public List<Notebook> getNotebooksByPrice(Integer minPrice) {
        // получение всех ноутбуков по цене
        List<Notebook> result = new ArrayList<>();
        for (Notebook notebook : this.notebooks) {
            if (notebook.getPrice() >= minPrice) {
                result.add(notebook);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Notebook notebook : notebooks) {
            sb.append("\n");
            sb.append(notebook.toString());
        }
        return sb.toString();
    }
}

