package com.xworkz.task.bean.CameraManFile;

import org.springframework.stereotype.Component;

@Component
public class Camera {
private Lens lens;
private Battery battery;
public Camera() {
	System.out.println("Created camera...");

}
@Override
public String toString() {
	return "Camera [lens=" + lens + ", battery=" + battery + "]";
}

}