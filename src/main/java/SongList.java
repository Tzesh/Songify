/**
 * Deprecated version of LinkedList implementation new version is available on utils package
 * public class SongList {
 * Song head;
 * <p>
 * public SongList add(SongList list, Song song) {
 * if (list.head == null) list.head = song;
 * else {
 * Song last = list.head;
 * while (last.next != null) last = last.next;
 * last.next = song;
 * }
 * return list;
 * }
 * <p>
 * public void printList(SongList list) {
 * Song currentNode = list.head;
 * <p>
 * while (currentNode != null) {
 * System.out.println(currentNode);
 * currentNode = currentNode.next;
 * }
 * }
 * <p>
 * public SongList remove(SongList list, Song song) {
 * Song currentNode = list.head, prev = null;
 * <p>
 * if (currentNode != null && currentNode.equals(song)) {
 * list.head = currentNode.next;
 * return list;
 * }
 * <p>
 * while (currentNode != null && !currentNode.equals(song)) {
 * prev = currentNode;
 * currentNode = currentNode.next;
 * }
 * <p>
 * if (currentNode != null) prev.next = currentNode.next;
 * <p>
 * return list;
 * }
 * <p>
 * public boolean contains(SongList list, Song song) {
 * Song currentNode = list.head;
 * <p>
 * if (currentNode != null && currentNode.equals(song)) {
 * return true;
 * }
 * <p>
 * while (currentNode != null && !currentNode.equals(song)) {
 * currentNode = currentNode.next;
 * }
 * <p>
 * return currentNode != null;
 * }
 * <p>
 * public Song get(SongList list, Song song) {
 * Song currentNode = list.head;
 * <p>
 * if (currentNode != null && currentNode.equals(song)) {
 * return currentNode;
 * }
 * <p>
 * while (currentNode != null && !currentNode.equals(song)) {
 * currentNode = currentNode.next;
 * }
 * <p>
 * return currentNode;
 * }
 * <p>
 * public Song get(SongList list, int index) {
 * Song currentNode = list.head;
 * <p>
 * if (index == 0 && currentNode != null) return currentNode;
 * <p>
 * for (int i = 0; i < index; i++) {
 * if (currentNode.next == null) return null;
 * currentNode = currentNode.next;
 * }
 * <p>
 * return currentNode;
 * }
 * <p>
 * public int size(SongList list) {
 * int size = 0;
 * <p>
 * Song currentNode = list.head;
 * <p>
 * if (currentNode == null) return size;
 * <p>
 * while (currentNode != null) {
 * size++;
 * currentNode = currentNode.next;
 * }
 * return size;
 * }
 * <p>
 * public SongList sort(SongList list) {
 * int size = list.size(list);
 * if (size > 1) {
 * for (int i = 0; i < size; i++ ) {
 * Song currentNode = list.head;
 * Song next = head.next;
 * for (int j = 0; j < size - 1; j++) {
 * if (currentNode.getCounter() < next.getCounter()) {
 * //currentNode.swap(next);
 * }
 * currentNode = next;
 * next = next.next;
 * }
 * }
 * }
 * return list;
 * }
 * <p>
 * }
 **/