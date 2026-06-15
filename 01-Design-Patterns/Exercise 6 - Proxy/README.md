# Exercise 6: Implementing the Proxy Pattern

## Objective
To develop an image viewer application that loads images from a remote server using the Proxy Pattern to add lazy initialization and caching.

## Implementation Details
- **Image.java**: Subject interface containing `display()` method.
- **RealImage.java**: Real subject class that loads a file from a remote server (simulating network latency) and displays it.
- **ProxyImage.java**: Proxy class that wraps `RealImage`. It only instantiates `RealImage` when `display()` is called for the first time (lazy initialization) and caches the instance for subsequent calls (caching).
- **ProxyTest.java**: Test application showcasing the lazy loading and caching mechanisms of the proxy pattern.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 6 - Proxy/*.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise06.ProxyTest
   ```

## Output
```text
--- First display call (Requires Loading) ---
Loading image: photo_high_res.jpg from remote server...
Displaying image: photo_high_res.jpg

--- Second display call (Cached, Should not reload) ---
Retrieving photo_high_res.jpg from cache...
Displaying image: photo_high_res.jpg

-------------------------------------------
--- Display call for image2 (First time) ---
Loading image: wallpaper.png from remote server...
Displaying image: wallpaper.png
```
