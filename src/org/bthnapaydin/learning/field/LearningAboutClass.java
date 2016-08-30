package org.bthnapaydin.learning.field;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.util.Map;
import java.util.Objects;

/**
 * Created by bapaydin on 30.08.2016.
 */
public class LearningAboutClass {
    public static void main(String[] args) throws IntrospectionException {

        /** About fields */
        PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(TestClass.class, Object.class).getPropertyDescriptors();

        for(PropertyDescriptor propertyDescriptor : propertyDescriptors){
            System.out.println("Propertie name : " + propertyDescriptor.getName());
            System.out.println("Propertie description : " + propertyDescriptor.getShortDescription());
            System.out.println("Propertie read method : " + propertyDescriptor.getReadMethod());
            System.out.println("Propertie write method : " + propertyDescriptor.getWriteMethod());
        }

        /** About methods */
        MethodDescriptor[] methodDescriptors = Introspector.getBeanInfo(TestClass.class, Object.class).getMethodDescriptors();
        for(MethodDescriptor methodDescriptor : methodDescriptors){
            System.out.println("Method name : " + methodDescriptor.getName());
        }
    }
}
