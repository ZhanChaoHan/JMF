package com.jachs.jmf.audio;

import java.io.File;
import java.io.IOException;

import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;


/***
 * 
 * @author zhanchaohan
 *
 */
public class Test {
	public static void main(String[] args) {
		String str1 = "E:\\FFOutput\\冰幽 - 【古风原创】辞.九门回忆(二月红).wav";// 你的音频文件路径
		try {
			File f = new File(str1);
			MediaLocator mediaLoc = new MediaLocator("file:///" + f.getAbsolutePath());
			Player p;
			p = Manager.createRealizedPlayer(mediaLoc);
			p.prefetch();
			p.start();
		} catch (NoPlayerException | CannotRealizeException | IOException e) {
			e.printStackTrace();
		}
	}
}
