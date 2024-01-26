package Facade;

import java.io.File;

// Facade class
class VideoConverter {
    private CodecFactory codecFactory;
    private OggCompressionCodec oggCodec;
    private MPEG4CompressionCodec mp4Codec;

    public VideoConverter() {
        this.codecFactory = new CodecFactory();
        this.oggCodec = new OggCompressionCodec();
        this.mp4Codec = new MPEG4CompressionCodec();
    }

    public File convert(String filename, String format) {
        VideoFile file = new VideoFile(filename);
        Codec sourceCodec = codecFactory.extract(file);
        Codec destinationCodec = (format.equals("mp4")) ? mp4Codec : oggCodec;

        byte[] buffer = BitrateReader.read(filename, sourceCodec);
        byte[] result = BitrateReader.convert(buffer, destinationCodec);
        result = new AudioMixer().fix(result);

        // Assuming File is a class representing the output file
        return new File(new String(result));
    }
}


