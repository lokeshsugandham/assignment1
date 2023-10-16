function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => reverseWord(word));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
  }
  function reverseWord(word) {
    const reversed = word.split('').reverse().join('');
    return reversed;
  }
  let inputSentence = "Dont believe that today was not a bad day  ";
  const reversed = reverseWordsInSentence(inputSentence);
  console.log(reversed);
  