package proyecto1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TemplateScanner {

    private String templatePath;
    private List<String> templateLines;

    public TemplateScanner(String templatePath) {
        this.templatePath = templatePath;
        this.templateLines = new ArrayList<>();
    }

    public void readTemplate() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(templatePath));
            String line;
            while ((line = reader.readLine()) != null) {
                templateLines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printTemplate() {
        for (String line : templateLines) {
            System.out.println(line);
        }
    }

    public List<String> getTemplateLines() {
        return templateLines;
    }

    public void setTemplateLines(List<String> templateLines) {
        this.templateLines = templateLines;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

}
