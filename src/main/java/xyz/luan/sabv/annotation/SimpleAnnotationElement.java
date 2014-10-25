package xyz.luan.sabv.annotation;

import java.lang.annotation.Annotation;

public class SimpleAnnotationElement implements AnnotationElement {
    private Annotation annotation;

    public SimpleAnnotationElement(Annotation annotations) {
        this.annotation = annotations;
    }

    @Override
    public String toJson() {
        return AnnotationsToJson.annotationToJson(annotation);
    }
}