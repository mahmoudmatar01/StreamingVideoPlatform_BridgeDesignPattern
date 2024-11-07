# StreamingVideoPlatform_BridgeDesignPattern

This project demonstrates the **Bridge Design Pattern** by separating the abstraction (video provider) from the implementation (video quality). In a streaming video platform, this pattern allows video providers like YouTube and Twitch to operate with different video quality options (SD, HD), enhancing flexibility and scalability.

## Project Structure

The project consists of the following components:

1. **VideoQuality (Interface)**
   - Represents the implementation side of the bridge, defining a common method for rendering video quality.
   - `renderVideoQuality()`: Renders the video in the specified quality.

2. **SDVideoQuality and HDVideoQuality (Classes)**
   - Implement the `VideoQuality` interface for different quality types.
   - `SDVideoQuality`: Represents standard definition video quality.
   - `HDVideoQuality`: Represents high-definition video quality.

3. **VideoProvider (Abstract Class)**
   - Serves as the abstraction in the bridge pattern.
   - Holds a reference to a `VideoQuality` implementation, allowing the `VideoProvider` to operate with different quality settings.
   - `play()`: An abstract method for playing videos in the desired quality, implemented by subclasses.

4. **YoutubeVideoPlayer and TwitchVideoPlayer (Classes)**
   - Extend `VideoProvider` and implement the `play()` method specific to each video provider.
   - `YoutubeVideoPlayer` and `TwitchVideoPlayer` showcase how each provider can use different video quality settings without modifying the existing classes.

5. **Main (Driver Class)**
   - Demonstrates the Bridge Pattern by creating instances of video players with different quality settings.
   - Simulates the use of both YouTube and Twitch with separate quality configurations.

## How It Works

1. **Bridge Design Pattern**:
   - The Bridge Pattern is used to decouple the `VideoProvider` (abstraction) from `VideoQuality` (implementation).
   - This allows any video provider (e.g., YouTube, Twitch) to operate independently of the video quality, promoting flexibility and enabling multiple combinations.

2. **Runtime Flexibility**:
   - A `VideoProvider` instance can use any `VideoQuality` instance, which enables changing video quality without altering the `VideoProvider` subclasses.
   - For instance, `YoutubeVideoPlayer` can use either `SDVideoQuality` or `HDVideoQuality` without requiring any additional modifications to the existing classes.

## Sample Output

Running the `Main` class produces output similar to:

```plaintext
rendering video quality HD ..................
Play youtube video ......
render video quality SD ...................
Play twitch video .........
```


## Key Takeaways
- Bridge Design Pattern: Decouples abstraction and implementation, allowing them to vary independently.
- Scalability: New video providers and quality options can be added without modifying existing code.
- Code Reusability: The pattern encourages reusability by enabling different combinations of providers and quality levels.


## Usage
1. Clone the repository and navigate to the project directory.
2. Compile the project files.
3. Run the `Main` class to see the Bridge Pattern in action, simulating different video providers and quality settings.
